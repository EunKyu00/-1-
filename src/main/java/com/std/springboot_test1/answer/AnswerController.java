package com.std.springboot_test1.answer;

import com.std.springboot_test1.article.Article;
import com.std.springboot_test1.article.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

    private final ArticleService articleService;

    @GetMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam("content") String content){
        Article article = this.articleService.getArticle(id);
        return String.format("redirect:/article/detail/%s",id);
    }

}
