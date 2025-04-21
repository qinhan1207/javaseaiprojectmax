package com.qinhan.demo8test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    // 4.准备一个集合容器：存储全部上架的电影数据
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void start() {
        // 3.准备操作界面
        while (true) {
            System.out.println("=====电影信息操作系统======");
            System.out.println("1、上架");
            System.out.println("2、下架某个电影");
            System.out.println("3、查询某个电影");
            System.out.println("4、封杀某个明星");
            System.out.println("5、退出系统");
            System.out.println("6、展示全部电影");
            System.out.println("7、修改某个电影");
            System.out.println("请您输入操作命令:");
            String command = sc.nextLine();
            switch (command) {
                case "1":
                    // 上架
                    addMovie();
                    break;
                case "2":
                    // 下架
                    deleteMovie();
                    break;
                case "3":
                    // 查询
                    queryMovie();
                    break;
                case "4":
                    // 封杀某个电影明星
                    deleteStar();
                    break;
                case "5":
                    System.out.println("退出成功");
                    return;
                case "6":
                    // 展示全部电影
                    queryAllMovies();
                    break;
                case "7":
                    updateMovie();
                default:
                    System.out.println("您输入的命令有误，请重新输入");
            }
        }
    }

    private void updateMovie() {
        System.out.println("========修改某个电影=======");
        System.out.println("请输入要修改的电影的名称");
        String name = sc.nextLine();

    }

    /**
     * 查询所有电影
     */
    private void queryAllMovies() {
        System.out.println("========展示所有电影========");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    private void deleteStar() {
        System.out.println("======封杀明星======");
        System.out.println("请输入要封杀的明星：");
        String name = sc.nextLine();
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()){
            Movie movie = it.next();
            if (movie.getActor().contains(name)){
                it.remove();
            }
        }
        // 展示全部电影
        queryAllMovies();
    }

    /**
     * 下架某个电影
     */
    private void deleteMovie() {
        System.out.println("请输入要下架电影的电影的名称");
        String name = sc.nextLine();
        Movie movie = queryMovieByName(name);
        if (movie!=null){
            System.out.println("已成功下架");
            movies.remove(movie);
        } else {
            System.out.println("没有找到要下架的电影");
        }
    }

    /**
     * 根据电影名称查询某部电影的信息
     */
    private void queryMovie() {
        // 1.输入要查询的电影名称
        System.out.println("请输入要查询的电影的名称");
        String name = sc.nextLine();
        // 根据电影名称查询电影对象返回，展示这个对象数据
        Movie movie = queryMovieByName(name);
        if (movie!=null){
            System.out.println(movie);
        } else {
            System.out.println("没有找到这个电影");
        }

    }

    // 根据电影名称查询电影对象返回，展示这个对象数据
    public Movie queryMovieByName(String name){
        for (Movie movie : movies) {
            if (movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }


    /**
     * 上架电影
     */

    private void addMovie() {
        System.out.println("=======上架电影=======");
        // 1. 准备一个电影对象
        Movie movie = new Movie();
        // 2. 录入电影信息
        System.out.println("请输入电影名称：");
        movie.setName(sc.nextLine());
        System.out.println("请输入电影评分：");
        movie.setScore(Double.valueOf(sc.nextLine()));
        System.out.println("请输入电影演员：");
        movie.setActor(sc.nextLine());
        System.out.println("请输入电影价格：");
        movie.setPrice(Double.valueOf(sc.nextLine()));
        // 3. 将电影对象添加到集合中
        movies.add(movie);
        System.out.println("上架成功");

    }
}
