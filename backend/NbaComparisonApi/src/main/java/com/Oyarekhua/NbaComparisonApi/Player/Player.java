package com.Oyarekhua.NbaComparisonApi.Player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    private String PlayerId;
    private String FirstName;
    private String LastName;
    private String PlayerSlug;
    private int TeamId;
    private String TeamSlug;
    private String TeamName;
    private String TeamAbbreviation;
    private int JerseyNumber;
    private String Position;
    private String Height;
    private double Weight;
    private boolean RosterStatus;
    private String StatsTimeFrame;
    private int ToYear;
    private int FromYear;
    private String image;






}
