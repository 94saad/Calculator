package com.company;

public class Insurance {
    public void criteria(int age, int gender, int prof, int perAsset) {
        SixteenToTwentyfive(age,gender,prof,perAsset);
        TwentysixToFourty(age,gender,prof,perAsset);
        FourtyToSixty(age,gender,prof,perAsset);
        SixtyOrAbove(age,gender,prof,perAsset);
    }

    private int SixteenToTwentyfive(int age, int gender, int prof, int perAsset){
        {
            if (age >= 16 || age <= 25) {
                if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
                    if (prof == 's' || prof == 'S') {
                        if (perAsset >= 25000) {
                            // give 10000
                        }
                    }
                if (prof == 'P' || prof == 'p'){
                    if (perAsset <= 25000) {
                        // give 15000
                    }
                }

            }
        }
           return 0;
    }


    private int TwentysixToFourty(int age, int gender, int prof, int perAsset){
        {
            if (age >= 26 || age <= 40) {
                if (prof == 's' || prof == 'S' || prof == 'P' || prof == 'p')
                    if (gender == 'M' || gender == 'm') {
                        if (perAsset >= 40000) {
                            // give 25000
                        }
                    }
                if (gender == 'f' || gender == 'F'){
                    if (perAsset >= 40000) {
                        // give 30000
                    }
                }

            }
        }
        return 0;
    }


    private int  FourtyToSixty(int age, int gender, int prof, int perAsset){
        {
            if (age >= 41 || age <= 60) {
                if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
                    if (prof == 's' || prof == 'S') {
                        if (perAsset >= 50000) {
                            // give 40000
                        }
                    }
            }
        }
        return 0;
    }


    private int SixtyOrAbove(int age, int gender, int prof, int perAsset){
        {
            if (age >= 60) {
                if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')
                    if (prof == 's' || prof == 'S') {
                        if (perAsset >= 25000) {
                            // give 10000
                        }
                    }
                if (prof == 'P' || prof == 'p'){
                    if (perAsset >= 25000) {
                        // give 15000
                    }
                }

            }
        }
        return 0;
    }
       }