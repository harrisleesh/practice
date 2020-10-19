package practice.harris.lee.pagingandsorting.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.harris.lee.pagingandsorting.entity.Post;
import practice.harris.lee.pagingandsorting.entity.PostRepository;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/posts")
    public Page<Post> getPostByPage(Pageable pageable){
        return postRepository.findAll(pageable);
    }
}
