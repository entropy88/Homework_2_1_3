package com.example.entropy.gag9;

import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by entropy on 3/3/2018.
 */

public class ItemBunch {
    private static List<AllTheStuff> bunchOfPosts;
    public static  List<AllTheStuff> getBunchOfPosts() {
        if (bunchOfPosts == null) {
            bunchOfPosts = generateData();
        }
        return bunchOfPosts;
    }
        private static List<AllTheStuff> generateData(){
            return Arrays.asList(
                    new Posts ("Post Title1",
                            "http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg"),
            new Posts ("Post Title2",
                    "http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg"),
                    new Posts ("Post Title3",
                            "http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg"),
                    new Posts ("Post Title4",
                            "http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg"),
                    new Publicity("http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg"),
                    new Posts ("Post Title4",
                            "http://www.abc.net.au/news/image/7797710-1x1-940x940.jpg")

            );
        }
    }

