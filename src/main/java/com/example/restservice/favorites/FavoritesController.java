package com.example.restservice.favorites;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/favorites")
public class FavoritesController {

    private final Logger log = LoggerFactory.getLogger(FavoritesController.class);

    public FavoritesController() {

    }

}
