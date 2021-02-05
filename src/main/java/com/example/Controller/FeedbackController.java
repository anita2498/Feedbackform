package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.Feedback;
import com.example.Repository.UserCrudRepository;

@RestController
@RequestMapping("feedback")
public class FeedbackController {

    @Autowired
    UserCrudRepository userCrudRepository;


    @PostMapping("/submit")
	public String userRegister(@RequestParam("name") String name, @RequestParam("email") String email , @RequestParam("feedback1") String feedback1) {
	Feedback f = new Feedback(name,email,feedback1);
	boolean data= addFeedback(f);
	if(data) {
		return "Your Feedback has been added succesfully!";
	}
	else {
		return "Unable to add the feedback";
	}
		
	}

public boolean addFeedback( Feedback f) {
	userCrudRepository.save(f);
	return true;
}


}
