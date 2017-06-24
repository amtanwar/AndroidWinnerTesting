package com.example.amtanwar.winnertesting;

/**
 * Created by AmTanwar on 24/6/17.
 */

public class Winner {
    public String winner(String b, String m) {
        int goal_barc;
        int goal_mad;

        String message = "";

        goal_barc = Integer.parseInt(b);
        goal_mad = Integer.parseInt(m);

        if(goal_barc > 20 || goal_mad > 20) {
            message = "Enter valid values";
        }
        else {
            if (goal_barc > goal_mad) {
                message = "Barcelona won !";
            } else if (goal_barc < goal_mad) {
                message = "Madrid won !";
            } else {
                message = "Draw ! Good Game!";
            }
        }

        return message;
    }
}
