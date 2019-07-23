package com.ms.project.portafolio.commons.helper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ms.project.portafolio.commons.bean.ProductoBean;
import com.ms.project.portafolio.commons.entity.ProductoEntity;

/**
 * @author German Vazquez Renteria
 * Date:  22 jul. 2019
 * Package Name: com.ms.project.portafolio.commons.helper
 * Project Name: productos-commons
 */
@Component
public class ProductosHelper {

	public List<ProductoBean> toListBean(List<ProductoEntity> list) {
		return list.stream().map(this::toBean).collect(Collectors.toList());
	}

	public List<ProductoEntity> toListEntity(List<ProductoBean> list) {
		return list.stream().map(this::toEntity).collect(Collectors.toList());
	}

	public ProductoBean toBean(ProductoEntity productoEntity) {
		ProductoBean productoBean = new ProductoBean();
		productoBean.setCreateAt(productoEntity.getCreateAt());
		productoBean.setId(productoEntity.getId());
		productoBean.setNombre(productoEntity.getNombre());
		productoBean.setPort(productoEntity.getPort());
		productoBean.setPrecio(productoEntity.getPrecio());
		return productoBean;
	}

	public ProductoEntity toEntity(ProductoBean productoBean) {
		ProductoEntity productoEntity = new ProductoEntity();
		productoEntity.setCreateAt(productoBean.getCreateAt());
		productoEntity.setId(productoBean.getId());
		productoEntity.setNombre(productoBean.getNombre());
		productoEntity.setPort(productoBean.getPort());
		productoEntity.setPrecio(productoBean.getPrecio());
		return productoEntity;
	}

}
