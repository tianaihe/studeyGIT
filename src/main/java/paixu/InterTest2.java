package paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterTest2 {

    public static void main(String[] args) {

        List<UserInfo> userInfoList = new ArrayList<>();

        userInfoList.add(new UserInfo(0, "大强", 12));

        userInfoList.add(new UserInfo(1, "大黄", 18));

        userInfoList.add(new UserInfo(2, "大黑", 16));

        userInfoList.add(new UserInfo(0, "大白", 52));

        userInfoList.add(new UserInfo(0, "红红", 8));

        userInfoList.add(new UserInfo(0, "翠花", 16));

        userInfoList.add(new UserInfo(0, "芹菜", 36));

        System.out.println("排序前");

        for (UserInfo userInfo : userInfoList) {

            System.out.println(userInfo);

        }
        userInfoList.sort((a1,z1) -> a1.getAge()-z1.getAge());
        System.out.println("ni"+userInfoList);

        // 通常是这样写
       /* Collections.sort(userInfoList, new Comparator<UserInfo>() {

            @Override

            public int compare(UserInfo o1, UserInfo o2) {

                return o1.getAge() > o2.getAge() ? 1 : (o1.getAge() == o2.getAge() ? 0 : -1);

            }

        });*/


        System.out.println("排序后");

        for (UserInfo userInfo : userInfoList) {

            System.out.println(userInfo);

        }

    }

}