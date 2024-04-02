package com.practice.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class GameController {

    private static final String NINJA_GOLD_SESSION_KEY = "ninjaGold";
    private static final String EXPLOITS_SESSION_KEY = "exploits";
    private static final String DATE_FORMAT_PATTERN = "MMMM d Y h:mm a";
    private static final String REDIRECT_HOME = "redirect:/";

    private final Random random = new Random();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
    
    

    @RequestMapping("/exploits")
    public String exploits() {
        return "activities";
    }

    @RequestMapping("/")
    public String play(HttpSession session,
                       @RequestParam(value = "mine", required = false) String mine,
                       @RequestParam(value = "cave", required = false) String cave,
                       @RequestParam(value = "home", required = false) String home,
                       @RequestParam(value = "quest", required = false) String quest) {

        initializeSessionAttributes(session);

        if (mine != null) {
            processActivity(session, 10, 20, "mine");
        } else if (cave != null) {
            processActivity(session, 5, 10, "cave");
        } else if (home != null) {
            processActivity(session, 2, 5, "home");
        } else if (quest != null) {
            processQuest(session);
        }

        return REDIRECT_HOME;
    }

    private void initializeSessionAttributes(HttpSession session) {
        if (session.getAttribute(NINJA_GOLD_SESSION_KEY) == null) {
            session.setAttribute(NINJA_GOLD_SESSION_KEY, 0);
            session.setAttribute(EXPLOITS_SESSION_KEY, new ArrayList<>());
        }
    }

    private void processActivity(HttpSession session, int minGold, int maxGold, String activity) {
        int amount = random.nextInt(maxGold - minGold + 1) + minGold;
        updateSessionAttributes(session, amount, "You entered a " + activity + " and earned " + amount + " gold.");
    }

    private void processQuest(HttpSession session) {
        int amount = random.nextInt(101) - 50;
        String message = amount >= 0 ?
                "You completed an adventure and earned " + amount + " gold." :
                "You failed an adventure and lost " + (amount * -1) + " gold.";
        updateSessionAttributes(session, amount, message);
    }

    private void updateSessionAttributes(HttpSession session, int goldAmount, String activityMessage) {
        int ninjaGold = (int) session.getAttribute(NINJA_GOLD_SESSION_KEY);
        ninjaGold += goldAmount;

        @SuppressWarnings("unchecked")
        ArrayList<String> exploits = (ArrayList<String>) session.getAttribute(EXPLOITS_SESSION_KEY);
        exploits.add(0, activityMessage + " (" + simpleDateFormat.format(new Date()) + ")");

        session.setAttribute(EXPLOITS_SESSION_KEY, exploits);
        session.setAttribute(NINJA_GOLD_SESSION_KEY, ninjaGold);
    }
}
