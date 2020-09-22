package com.sidaodin.zhihuimall.product.web;

import com.sidaodin.zhihuimall.product.entity.CategoryEntity;
import com.sidaodin.zhihuimall.product.service.CategoryService;
import com.sidaodin.zhihuimall.product.vo.Catelog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;

    @GetMapping({"/","/index.html"})
    public String indexPage(Model model){

        //TODO 1、查出所有的1级分类
        List<CategoryEntity> categoryEntities = categoryService.getLevel1Categorys();

        model.addAttribute("categorys", categoryEntities);
        return "index";
    }

    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String, List<Catelog2Vo>> getCatalogJson(){

        Map<String, List<Catelog2Vo>> catalogJson = categoryService.getCatalogJson();
        return catalogJson;
    }
}
