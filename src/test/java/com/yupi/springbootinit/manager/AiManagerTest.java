package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;
    @Test
    void doChat() {
        String doChat = aiManager.doChat(1679321034651721729L,"请帮我推荐类似于邓紫棋曲风的歌曲");
        System.out.println(doChat);
    }
}