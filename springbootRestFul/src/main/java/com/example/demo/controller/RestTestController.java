package com.example.demo.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Players;
import com.example.demo.vo.Team;



@RestController
public class RestTestController {
	private Team team;
	
	@PostConstruct
	public void init() {
		Set<Players> players = new HashSet<>();
		players.add(new Players("Krishna", "position1"));
		players.add(new Players("Suji", "position2"));
		players.add(new Players("Mithin", "position3"));
		players.add(new Players("Nikki", "position4"));
		players.add(new Players("Nikki", "position5"));
		
		team= new Team("Georgia", "Atlanta", players);
	}
	
	@RequestMapping("/restTest")
	public  Team hiThere(Map model) {
		Team team;
		Set<Players> players = new HashSet<>();
		players.add(new Players("Krishna", "position1"));
		players.add(new Players("Suji", "position2"));
		players.add(new Players("Mithin", "position3"));
		players.add(new Players("Nikki", "position4"));
		players.add(new Players("Nikki", "position5"));
		
		team= new Team("Georgia", "Atlanta", players);
		return team;
	}
}
