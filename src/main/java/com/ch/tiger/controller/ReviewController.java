package com.ch.tiger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ch.tiger.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewService rs;
}