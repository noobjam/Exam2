package com.school.exam2.controller;


import org.assertj.core.util.Arrays;
import org.hibernate.mapping.List;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    @RequestMapping("/profile")
    public class RoleController {

        @Secured({"ROLE_DEV", "ROLE_TEST", "ROLE_DEVOPS"})
        @GetMapping
        public List<String> getProfileRoles() {
            return Arrays.asList("Developer", "Tester", "DevOps");
        }
    }

    @GetMapping("/devops")
    public String getDevOpsRole() {
        return "DevOps Engineer";
    }
}

