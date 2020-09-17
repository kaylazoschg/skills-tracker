package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homePage() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    public String createForm() {
        String html = "<html>" +
                "<body>" +
                "<form action='' method='post'>" +
                "<label>Name:</label>" +
                "</br>" +
                "<input type='text' name='name'>" +
                "</br>" +
                "<label>My favorite language:</label>" +
                "</br>" +
                "<select name='first'>" +   // first option
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</br>" +
                "<label>My second favorite language:</label>" +
                "</br>" +
                "<select name='second'>" +  // second option
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</br>" +
                "<label>My third favorite language:</label>" +
                "</br>" +
                "<select name='third'>" +   // third option
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</br>" +
                "<input type='submit' value='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @PostMapping("form")
    public String updatedList(@RequestParam String name, @RequestParam String first,
                              @RequestParam String second, @RequestParam String third) {
        String html = "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

}
