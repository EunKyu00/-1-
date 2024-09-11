package com.std.springboot_test1;

import com.std.springboot_test1.article.Article;
import com.std.springboot_test1.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SpringbootTest1ApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;
	@Test
	void contextLoads() {
		Article a1 = new Article();
		a1.setTitle("이은규");
		a1.setContent("테스트시험중");
		a1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a1);
	}

}
