package com.java2nb.novel.book.controller.api;

import com.java2nb.novel.book.entity.Book;
import com.java2nb.novel.book.service.BookService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
import java.util.List;

/**
 * 小说微服务API接口（内部调用）
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/27
 */
@RestController
@RequestMapping(("api/book"))
@ApiIgnore
@RequiredArgsConstructor
public class BookApi {

    private final BookService bookService;

    /**
     * 根据最小更新时间分页查询书籍列表
     * @param minDate 最小时间，包括该时间
     * @param limit 查询数量
     * @return 书籍列表
     * */
    @GetMapping("queryBookByMinUpdateTime")
    List<Book> queryBookByMinUpdateTime(Date minDate, int limit){

        return bookService.queryBookByMinUpdateTime(minDate,limit);
    }


}