package com.ms.project.portafolio.commons.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author German Vazquez Renteria
 * Date:  22 jul. 2019
 * Package Name: com.ms.project.portafolio.commons.bean
 * Project Name: productos-commons
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoBean implements Serializable {

	private static final long serialVersionUID = -8025076245722955388L;

	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	private Integer port;
}
