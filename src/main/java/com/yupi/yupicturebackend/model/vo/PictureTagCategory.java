package com.yupi.yupicturebackend.model.vo;

import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class PictureTagCategory {
    private List<String> tagList;
    private List<String> categoryList;
}
