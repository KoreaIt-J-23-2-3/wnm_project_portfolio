package com.woofnmeow.wnm_project_back.dto.request;

import com.woofnmeow.wnm_project_back.entity.Cart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AddCartReqDto {
    private int productDtlId;
    private int count;

    public Cart toCartProductsEntity(int userid) {
        return Cart.builder()
                .userId(userid)
                .productDtlId(productDtlId)
                .count(count)
                .build();
    }
}
