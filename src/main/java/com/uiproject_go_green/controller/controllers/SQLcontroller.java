package com.uiproject_go_green.controller.controllers;

import org.springframework.stereotype.Controller;
import java.sql.*;
import java.util.ArrayList;


@Controller
public class SQLcontroller {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String sqlCommand;
    ArrayList<String> commands = new ArrayList<>();
    Statement s;
/*
    public ResultSet scriptCommand(String sqlCommand) {
        try {
            connection = com.uiproject_go_green.controllers.DBManager.DBManager.getConnection();
            ps = connection.prepareStatement(sqlCommand);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    public void batch(ArrayList<String> commands) {
        try {
            connection = com.uiproject_go_green.controller.DBManager.DBManager.getConnection();
            s = connection.createStatement();
            for (int i = 0; i < commands.size(); i++) {
                s.addBatch(commands.get(i));
            }
            s.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public ArrayList<Movie> getResults(ResultSet rs) {
        try {
            movieList.clear();
            while (rs.next()) {
                pHolder = new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7));
                movieList.add(pHolder);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return movieList;
    }

    public String arrayToString(ArrayList<Movie> movielist){
        movie = "";
        for (int i = 0; i < movielist.size(); i++) {
            movie += movieList.get(i);
        }
        return movie;*/
    }