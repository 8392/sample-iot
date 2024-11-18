package com.github.dingdaoyi.model.query;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.github.dingdaoyi.entity.Product;
import com.github.dingdaoyi.entity.ProductType;
import com.github.dingdaoyi.model.ToEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author dingyunwei
 */
@Data
public class ProductAddQuery implements ToEntity<Product> {


    /**
     * 产品型号
     */
    @Schema(description = "产品型号")
    @NotBlank(message = "产品型号不能为空")
    private String model;

    /**
     * 厂家
     */
    @Schema(description = "厂家")
    @NotBlank(message = "厂家不能为空")
    private String manufacturer;

    /**
     * 描述
     */
    @Schema(description = "描述")
    private String mark;

    /**
     * 协议id
     */
    @Schema(description = "协议id")
    private Integer protocolId;

    @Schema(description = "产品类型id")
    @NotNull(message = "请选择产品类型")
    private Integer productTypeId;


    @Override
    public Product toEntity() {
        Product product = new Product();
        product.setModel(model);
        product.setManufacturer(manufacturer);
        product.setMark(mark);
        product.setProtocolId(protocolId);
        product.setProductTypeId(productTypeId);
        return product;
    }
}