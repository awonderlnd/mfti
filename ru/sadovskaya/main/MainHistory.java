package ru.sadovskaya.main;

public class MainHistory {
    //1.1.1
        /*Point a = new Point();
        a.x = 5;
        a.y = 7;
        Point b = new Point();
        b.x = -1;
        b.y = 3;
        Point c = new Point();
        c.x = 0;
        c.y = -9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

    //1.1.2
        /*ru.sadovskaya.peoples.Person cleo = new ru.sadovskaya.peoples.Person();
        cleo.name = "Клеопатра";
        cleo.height = 152;
        ru.sadovskaya.peoples.Person pushkin = new ru.sadovskaya.peoples.Person();
        pushkin.name = "Пушкин";
        pushkin.height = 167;
        ru.sadovskaya.peoples.Person vova = new ru.sadovskaya.peoples.Person();
        vova.name = "Владимир";
        vova.height = 189;
        System.out.println(cleo);
        System.out.println(pushkin);
        System.out.println(vova);*/

    //1.1.3
        /*ru.sadovskaya.peoples.Name cleo = new ru.sadovskaya.peoples.Name();
        cleo.firstName = "Клеопатра";
        ru.sadovskaya.peoples.Name pushkin = new ru.sadovskaya.peoples.Name();
        pushkin.lastName = "Пушкин";
        pushkin.firstName = "Александр";
        pushkin.patronymic = "Сергеевич";
        ru.sadovskaya.peoples.Name vova = new ru.sadovskaya.peoples.Name();
        vova.lastName = "Маяковскаий";
        vova.firstName = "Владимир";
        System.out.println(cleo);
        System.out.println(pushkin);
        System.out.println(vova);*/

    //1.1.4
        /*ru.sadovskaya.math.Time time1 = new ru.sadovskaya.math.Time();
        time1.sec = 10;
        ru.sadovskaya.math.Time time2 = new ru.sadovskaya.math.Time();
        time2.sec = 10000;
        ru.sadovskaya.math.Time time3 = new ru.sadovskaya.math.Time();
        time3.sec = 100000;
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);*/

    //1.1.5
        /*Home home1 = new Home();
        home1.floor = 1;
        Home home2 = new Home();
        home2.floor = 5;
        Home home3 = new Home();
        home3.floor = 23;
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);*/

    //1.2.1
        /*Point start1 = new Point();
        start1.x = 1;
        start1.y = 3;
        Point end1 = new Point();
        end1.x = 23;
        end1.y = 8;
        ru.sadovskaya.geometry.Line line1 = new ru.sadovskaya.geometry.Line();
        line1.start = start1;
        line1.end = end1;

        Point start2 = new Point();
        start2.x = 5;
        start2.y = 10;
        Point end2 = new Point();
        end2.x = 25;
        end2.y = 10;
        ru.sadovskaya.geometry.Line line2 = new ru.sadovskaya.geometry.Line();
        line2.start = start2;
        line2.end = end2;

        Point start3 = new Point();
        start3.x = start1.x;
        start3.y = start1.y;
        Point end3 = new Point();
        end3.x = end1.x;
        end3.y = end1.y;
        ru.sadovskaya.geometry.Line line3 = new ru.sadovskaya.geometry.Line();
        line3.start = start3;
        line3.end = end3;

        start1.x = 2;
        start1.y = 6;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3); */

    //1.2.2
        /*ru.sadovskaya.peoples.Name cleop = new ru.sadovskaya.peoples.Name();
        cleop.firstName = "Клеопатра";
        ru.sadovskaya.peoples.Person cleo = new ru.sadovskaya.peoples.Person();
        cleo.name = cleop;
        cleo.height = 152;

        ru.sadovskaya.peoples.Name push = new ru.sadovskaya.peoples.Name();
        push.lastName = "Пушкин";
        push.firstName = "Александр";
        push.patronymic = "Сергеевич";
        ru.sadovskaya.peoples.Person pushkin = new ru.sadovskaya.peoples.Person();
        pushkin.name = push;
        pushkin.height = 167;

        ru.sadovskaya.peoples.Name vova = new ru.sadovskaya.peoples.Name();
        vova.lastName = "Маяковскаий";
        vova.firstName = "Владимир";
        ru.sadovskaya.peoples.Person mayak = new ru.sadovskaya.peoples.Person();
        mayak.name = vova;
        mayak.height = 189;

        System.out.println(cleo);
        System.out.println(pushkin);
        System.out.println(mayak);*/

    //1.2.3
        /*ru.sadovskaya.peoples.Person chudIvan = new ru.sadovskaya.peoples.Person();
        chudIvan.name.firstName = "Иван";
        chudIvan.name.lastName = "Чудов";

        ru.sadovskaya.peoples.Person chudPetr = new ru.sadovskaya.peoples.Person();
        chudPetr.name.firstName = "Петр";
        chudPetr.name.lastName = "Чудов";

        ru.sadovskaya.peoples.Person boris = new ru.sadovskaya.peoples.Person();
        boris.name.firstName = "Борис";

        chudPetr.father = chudIvan;
        boris.father = chudPetr;

        System.out.println(chudIvan);
        System.out.println(chudPetr);
        System.out.println(boris);*/

    //1.2.4
        /*ru.sadovskaya.peoples.Employee emp1 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Employee emp2 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Employee emp3 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Department IT = new ru.sadovskaya.peoples.Department();
        IT.name = "IT";
        IT.boss = emp2;
        emp1.name = "Петров";
        emp2.department = IT;
        emp2.name = "Козлов";
        emp3.name = "Сидоров";
        emp1.department = IT;
        emp3.department = IT;
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);*/

    //1.3.1
        /*ru.sadovskaya.peoples.Student stud1 = new ru.sadovskaya.peoples.Student();
        stud1.name = "Вася";
        stud1.gradeList = new ArrayList<>();
        stud1.gradeList.add(3);
        stud1.gradeList.add(4);
        stud1.gradeList.add(5);
        ru.sadovskaya.peoples.Student stud2 = new ru.sadovskaya.peoples.Student();
        stud2.name = "Петя";
        stud2.gradeList = stud1.gradeList;
        stud2.gradeList.set(0, 5); //Меняя оценки Пети мы меняем и оценки Васи, т.к.
        //ссылаемся на одно и то же значение в ячейке памяти в куче из-за присвоения полей
        ru.sadovskaya.peoples.Student stud3 = new ru.sadovskaya.peoples.Student();
        stud3.name = "Андрей";
        stud3.gradeList = new ArrayList<>(stud1.gradeList);
        stud3.gradeList.set(0, 4);
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);*/

    //1.3.2
        /*Point point1 = new Point();
        point1.x = 1;
        point1.y = 5;
        Point point2 = new Point();
        point2.x = 2;
        point2.y = 8;
        Point point3 = new Point();
        point3.x = 5;
        point3.y = 3;
        BrokenLine brokenLine1 = new BrokenLine();
        brokenLine1.pointList.add(point1);
        brokenLine1.pointList.add(point2);
        brokenLine1.pointList.add(point3);

        BrokenLine brokenLine2 = new BrokenLine();
        Point point4 = new Point();
        point4.x = 2;
        point4.y = -5;
        Point point5 = new Point();
        point5.x = 4;
        point5.y = -8;
        brokenLine2.pointList = new ArrayList<>(brokenLine1.pointList);
        brokenLine2.pointList.remove(1);
        brokenLine2.pointList.add(1, point4);
        brokenLine2.pointList.add(2, point5);
        System.out.println(brokenLine1);
        System.out.println(brokenLine2);
        point1.x = 2;
        point1.y = 6; //Сдвинуть начало обеих линий = сдвинуть координаты начальной точки
        System.out.println("---------------------------------");
        System.out.println(brokenLine1);
        System.out.println(brokenLine2);*/

    //1.3.3
        /*ru.sadovskaya.city.City a = new ru.sadovskaya.city.City();
        a.name = "A";
        ru.sadovskaya.city.City b = new ru.sadovskaya.city.City();
        b.name = "B";
        ru.sadovskaya.city.City c = new ru.sadovskaya.city.City();
        c.name = "C";
        ru.sadovskaya.city.City d = new ru.sadovskaya.city.City();
        d.name = "D";
        ru.sadovskaya.city.City e = new ru.sadovskaya.city.City();
        e.name = "E";
        ru.sadovskaya.city.City f = new ru.sadovskaya.city.City();
        f.name = "F";

        ru.sadovskaya.city.Destination aTob = new ru.sadovskaya.city.Destination();
        aTob.destination = b;
        aTob.price = 5;
        ru.sadovskaya.city.Destination aTod = new ru.sadovskaya.city.Destination();
        aTod.destination = d;
        aTod.price = 6;
        ru.sadovskaya.city.Destination aTof = new ru.sadovskaya.city.Destination();
        aTof.destination = f;
        aTof.price = 1;
        a.roadTo.add(aTob);
        a.roadTo.add(aTod);
        a.roadTo.add(aTof);

        ru.sadovskaya.city.Destination bToa = new ru.sadovskaya.city.Destination();
        bToa.destination = a;
        bToa.price = aTob.price;
        ru.sadovskaya.city.Destination bToc = new ru.sadovskaya.city.Destination();
        bToc.destination = c;
        bToc.price = 3;
        b.roadTo.add(bToa);
        b.roadTo.add(bToc);

        ru.sadovskaya.city.Destination cTob = new ru.sadovskaya.city.Destination();
        cTob.destination = b;
        cTob.price = bToc.price;
        ru.sadovskaya.city.Destination cTod = new ru.sadovskaya.city.Destination();
        cTod.destination = d;
        cTod.price = 4;
        c.roadTo.add(cTob);
        c.roadTo.add(cTod);

        ru.sadovskaya.city.Destination dToa = new ru.sadovskaya.city.Destination();
        dToa.destination = a;
        dToa.price = aTod.price;
        ru.sadovskaya.city.Destination dToc = new ru.sadovskaya.city.Destination();
        dToc.destination = c;
        dToc.price = cTod.price;
        ru.sadovskaya.city.Destination dToe = new ru.sadovskaya.city.Destination();
        dToe.destination = e;
        dToe.price = 2;
        d.roadTo.add(dToa);
        d.roadTo.add(dToc);
        d.roadTo.add(dToe);

        ru.sadovskaya.city.Destination eTof = new ru.sadovskaya.city.Destination();
        eTof.destination = f;
        eTof.price = 2;
        e.roadTo.add(eTof);

        ru.sadovskaya.city.Destination fTob = new ru.sadovskaya.city.Destination();
        fTob.destination = b;
        fTob.price = 1;
        ru.sadovskaya.city.Destination fToe = new ru.sadovskaya.city.Destination();
        fToe.destination = e;
        fToe.price = eTof.price;
        f.roadTo.add(fTob);
        f.roadTo.add(fToe);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);*/

    //1.3.4
        /*ru.sadovskaya.peoples.Employee emp1 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Employee emp2 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Employee emp3 = new ru.sadovskaya.peoples.Employee();
        ru.sadovskaya.peoples.Department IT = new ru.sadovskaya.peoples.Department();
        IT.name = "IT";
        IT.boss = emp2;
        emp1.name = "Петров";
        emp2.setDepartment(IT);
        emp2.name = "Козлов";
        emp3.name = "Сидоров";
        emp1.setDepartment(IT);
        emp3.setDepartment(IT);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(IT.employeeList);*/

    //1.4.1
        /*Point point1 = new Point(3, 5);
        Point point2 = new Point(25, 6);
        Point point3 = new Point(7, 8);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);*/

    //1.4.2
        /*ru.sadovskaya.geometry.Line line1 = new ru.sadovskaya.geometry.Line(1, 3, 23,8);
        ru.sadovskaya.geometry.Line line2 = new ru.sadovskaya.geometry.Line(5,10,25,10);
        ru.sadovskaya.geometry.Line line3 = new ru.sadovskaya.geometry.Line(line1.start, line2.end);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);*/

    //1.4.3
        /*Home home2 = new Home(2);
        Home home35 = new Home(35);
        Home home91 = new Home(91);
        System.out.println(home91);
        home91.floor = 90; //Ошибка java: cannot assign a value to final variable floor*/

    //1.4.4
        /*ru.sadovskaya.math.Time time1 = new ru.sadovskaya.math.Time(10000);
        ru.sadovskaya.math.Time time2 = new ru.sadovskaya.math.Time(2,3,5);
        System.out.println(time1);
        System.out.println(time2);*/

    //1.4.5
        /*ru.sadovskaya.peoples.Name cleo = new ru.sadovskaya.peoples.Name("Клеопатра");
        ru.sadovskaya.peoples.Name pushkin = new ru.sadovskaya.peoples.Name("Александр", "Сергеевич", "Пушкин");
        ru.sadovskaya.peoples.Name mayak = new ru.sadovskaya.peoples.Name("Владимир", "Маяковский");
        ru.sadovskaya.peoples.Name сhristophor = new ru.sadovskaya.peoples.Name("Христофор", "Бонифатьевич");
        System.out.println(cleo);
        System.out.println(pushkin);
        System.out.println(mayak);
        System.out.println(сhristophor);*/

    //1.4.6
        /*ru.sadovskaya.peoples.Person leo = new ru.sadovskaya.peoples.Person("Лев", 170);
        ru.sadovskaya.peoples.Name sergName = new ru.sadovskaya.peoples.Name("Сергей", "Пушкин");
        ru.sadovskaya.peoples.Person sergPers = new ru.sadovskaya.peoples.Person(sergName, 168, leo);
        ru.sadovskaya.peoples.Person pushkin = new ru.sadovskaya.peoples.Person("Александр", 167, sergPers);
        System.out.println(leo);
        System.out.println(sergPers);
        System.out.println(pushkin);*/

    //1.4.7
        /*ru.sadovskaya.peoples.Student vasia = new ru.sadovskaya.peoples.Student("Вася", 3, 4, 5);
        ru.sadovskaya.peoples.Student maxim = new ru.sadovskaya.peoples.Student("Максим");
        System.out.println(vasia);
        System.out.println(maxim);*/

    //1.4.8
        /*ru.sadovskaya.city.City a = new ru.sadovskaya.city.City("A");
        ru.sadovskaya.city.City b = new ru.sadovskaya.city.City("B", new ru.sadovskaya.city.Destination(a, 5));
        ru.sadovskaya.city.City c = new ru.sadovskaya.city.City("C", new ru.sadovskaya.city.Destination(b, 3));
        ru.sadovskaya.city.City d = new ru.sadovskaya.city.City("D", new ru.sadovskaya.city.Destination(a, 6), new ru.sadovskaya.city.Destination(c,4));
        ru.sadovskaya.city.City e = new ru.sadovskaya.city.City("E");
        ru.sadovskaya.city.City f = new ru.sadovskaya.city.City("F", new ru.sadovskaya.city.Destination(b, 1), new ru.sadovskaya.city.Destination(e, 2));

        ru.sadovskaya.city.Destination aTob = new ru.sadovskaya.city.Destination(b, 5);
        ru.sadovskaya.city.Destination aTod = new ru.sadovskaya.city.Destination(d, 6);
        ru.sadovskaya.city.Destination aTof = new ru.sadovskaya.city.Destination(f, 1);
        a.roadTo.add(aTob);
        a.roadTo.add(aTod);
        a.roadTo.add(aTof);

        ru.sadovskaya.city.Destination bToc = new ru.sadovskaya.city.Destination(c, 3);
        b.roadTo.add(bToc);

        ru.sadovskaya.city.Destination cTod = new ru.sadovskaya.city.Destination(d, 4);
        c.roadTo.add(cTod);

        ru.sadovskaya.city.Destination dToe = new ru.sadovskaya.city.Destination(e, 2);
        d.roadTo.add(dToe);

        ru.sadovskaya.city.Destination eTof = new ru.sadovskaya.city.Destination(f,2);
        e.roadTo.add(eTof);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
*/
    //1.4.9
        /*BrokenLine brokenLine1 = new BrokenLine();
        Point point1 = new Point(2, 4);
        Point point2 = new Point(-5, 3);
        Point point3 = new Point(11, 1);
        BrokenLine brokenLine2 = new BrokenLine(point1, point2, point3);
        System.out.println(brokenLine1);
        System.out.println(brokenLine2);*/

    //1.5.2
        /*ru.sadovskaya.animals.Cat barsik = new ru.sadovskaya.animals.Cat("Барсик");
        barsik.sayMeow();
        barsik.sayMeow(3);*/

    //1.5.3
        /*ru.sadovskaya.geometry.Line line = new ru.sadovskaya.geometry.Line(1,1,10,15);
        System.out.println(line.getDist());*/

    //1.5.4
        /*ru.sadovskaya.math.Time time1 = new ru.sadovskaya.math.Time(34056);
        ru.sadovskaya.math.Time time2 = new ru.sadovskaya.math.Time(4532);
        ru.sadovskaya.math.Time time3 = new ru.sadovskaya.math.Time(123);
        System.out.println(time1.getHour());
        System.out.println(time2.getMin());
        System.out.println(time3.getSec());*/

    //1.5.5
        /*ru.sadovskaya.math.Fraction fr1 = new ru.sadovskaya.math.Fraction(1,2);
        ru.sadovskaya.math.Fraction fr2 = new ru.sadovskaya.math.Fraction(1,5);
        ru.sadovskaya.math.Fraction fr3 = new ru.sadovskaya.math.Fraction(7, 5);

        System.out.println(fr1 + " + " + fr2 + " = " + fr1.sum(fr2));
        System.out.println(fr1.sum(3));

        System.out.println(fr1 + " - " + fr2 + " = " + fr1.minus(fr2));
        System.out.println(fr1.minus(3));

        System.out.println(fr1 + " * " + fr2 + " = " + fr1.mult(fr2));
        System.out.println(fr1.mult(3));

        System.out.println(fr1 + " / " + fr2 + " = " + fr1.div(fr2));
        System.out.println(fr1.div(3));

        System.out.println(fr1.sum(fr2).div(fr3).minus(5));*/

    //1.5.6
        /*ru.sadovskaya.peoples.Student vasya = new ru.sadovskaya.peoples.Student("Вася", 3,4,5,4);
        ru.sadovskaya.peoples.Student petya = new ru.sadovskaya.peoples.Student("Петя", 5,5,5,5);
        System.out.println(vasya.getAver());
        System.out.println(petya.getAver());
        System.out.println(vasya.isExcellent());
        System.out.println(petya.isExcellent());*/

    //1.5.7
        /*Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        BrokenLine brokenLine = new BrokenLine(point1, point2, point3);
        System.out.println(brokenLine);
        System.out.println(brokenLine.getDist());

        Point point4 = new Point(5, 15);
        Point point5 = new Point(8, 10);
        System.out.println("------------------------------");
        System.out.println(brokenLine.addPoints(point4, point5));
        System.out.println(brokenLine.getDist());*/

    //1.5.8
        /*ru.sadovskaya.geometry.Square square = new ru.sadovskaya.geometry.Square(5,3,23);
        BrokenLine brokenLine = square.getBrokenLine();
        System.out.println(brokenLine.getDist());
        brokenLine.pointList.set(brokenLine.pointList.size() - 1, new Point(15,25));
        System.out.println(brokenLine.getDist());*/

    //1.6.1
        /*Home home = new Home(8);
        System.out.println(home);
        Home homeExcep = new Home(-7);*/

    //1.6.2
        /*ru.sadovskaya.math.Time time = new ru.sadovskaya.math.Time(77777);
        System.out.println(time);
        ru.sadovskaya.math.Time time1 = new ru.sadovskaya.math.Time(12, 50,39);
        System.out.println(time1);
        ru.sadovskaya.math.Time time2 = new ru.sadovskaya.math.Time(90000);
        System.out.println(time2);
        ru.sadovskaya.math.Time time3 = new ru.sadovskaya.math.Time(72,54,7);
        System.out.println(time3);*/

    //1.6.3
        /*ru.sadovskaya.geometry.Square square1 = new ru.sadovskaya.geometry.Square(1,5,5);
        System.out.println(square1);
        System.out.println(square1.getSideLen());
        square1.setSideLen(6);
        System.out.println(square1);
        square1.setSideLen(-6);*/

    //1.6.4
        /*ru.sadovskaya.math.Fraction fr1 = new ru.sadovskaya.math.Fraction(5,8);
        ru.sadovskaya.math.Fraction fr2 = new ru.sadovskaya.math.Fraction(6,7);
        System.out.println(fr1.mult(fr2));
        ru.sadovskaya.math.Fraction fr3 = new ru.sadovskaya.math.Fraction(4, -8);*/

    //1.6.6
        /*Point point = new Point(-5,9);
        ru.sadovskaya.geometry.Line line1 = new ru.sadovskaya.geometry.Line(new Point(3,6), point);
        System.out.println(line1.getEnd());
        System.out.println(line1);
        line1.setEnd(new Point(11,11));
        System.out.println(line1);
        ru.sadovskaya.geometry.Line line2 = new ru.sadovskaya.geometry.Line(point, new Point(7,3));
        System.out.println(line2);*/

    //1.6.7
       /* ru.sadovskaya.peoples.Name name1 = new ru.sadovskaya.peoples.Name("", "");
        ru.sadovskaya.peoples.Name name2 = new ru.sadovskaya.peoples.Name("Николай");
        System.out.println(name2);
        name2.setFirstName("Вася");
        System.out.println(name2);*/

    //1.6.8
        /*ru.sadovskaya.peoples.Person leo = new ru.sadovskaya.peoples.Person("Лев", 170);
        ru.sadovskaya.peoples.Name sergName = new ru.sadovskaya.peoples.Name("Сергей", "Пушкин");
        ru.sadovskaya.peoples.Person sergPers = new ru.sadovskaya.peoples.Person(sergName, 168, leo);
        ru.sadovskaya.peoples.Person pushkin = new ru.sadovskaya.peoples.Person("Александр", 167, sergPers);
        System.out.println(pushkin.getName());
        System.out.println(leo.getName());
        System.out.println(pushkin.getFather());
        pushkin.setHeight(180);
        System.out.println(pushkin.getHeight());
        pushkin.setHeight(555);*/


    //1.6.9
        /*ru.sadovskaya.peoples.Student student1 = new ru.sadovskaya.peoples.Student("Alex", 2, 4, 5, 6, -3);
        System.out.println(student1);
        student1.setGrade(5);
        System.out.println(student1.getGradeList());
        student1.setGrade(1);
        System.out.println(student1.getGradeList());*/

    //1.6.10
//        ru.sadovskaya.city.City a = new ru.sadovskaya.city.City("A");
//        ru.sadovskaya.city.City b = new ru.sadovskaya.city.City("B", new ru.sadovskaya.city.Destination(a, 5));
//        ru.sadovskaya.city.City c = new ru.sadovskaya.city.City("C", new ru.sadovskaya.city.Destination(b, 3));
//        ru.sadovskaya.city.City d = new ru.sadovskaya.city.City("D", new ru.sadovskaya.city.Destination(a, 6), new ru.sadovskaya.city.Destination(c, 4));
//        ru.sadovskaya.city.City e = new ru.sadovskaya.city.City("E");
//        ru.sadovskaya.city.City f = new ru.sadovskaya.city.City("F", new ru.sadovskaya.city.Destination(b, 1), new ru.sadovskaya.city.Destination(e, 2));
//
//        a.setRoadTo(new ru.sadovskaya.city.Destination(b, 5), new ru.sadovskaya.city.Destination(d, 6), new ru.sadovskaya.city.Destination(f, 1));
//        b.setRoadTo(new ru.sadovskaya.city.Destination(c, 3));
//        c.setRoadTo(new ru.sadovskaya.city.Destination(d, 4));
//        d.setRoadTo(new ru.sadovskaya.city.Destination(e, 2));
//        e.setRoadTo(new ru.sadovskaya.city.Destination(f,2));
//
//        System.out.println(a);
//        a.dropRoadTo(b);


//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

    //1.6.11
        /*ru.sadovskaya.peoples.Department IT = new ru.sadovskaya.peoples.Department("IT");
        ru.sadovskaya.peoples.Department sales= new ru.sadovskaya.peoples.Department("Sales");
        ru.sadovskaya.peoples.Employee emp1 = new ru.sadovskaya.peoples.Employee("Петров", IT);
        ru.sadovskaya.peoples.Employee emp2 = new ru.sadovskaya.peoples.Employee("Козлов", IT);
        ru.sadovskaya.peoples.Employee emp3 = new ru.sadovskaya.peoples.Employee("Сидоров", sales);
        System.out.println(emp1);
        IT.setBoss(emp1);
        System.out.println(emp2);
        System.out.println(emp3);*/
    //3.1.2
        /*ru.sadovskaya.geometry.ClosedPolyline closedPolyline = new ru.sadovskaya.geometry.ClosedPolyline(new ru.sadovskaya.geometry.Point2D(4,5), new ru.sadovskaya.geometry.Point2D(-1,3),
                new ru.sadovskaya.geometry.Point2D(9,-6));
        System.out.println(closedPolyline);
        System.out.println(closedPolyline.getLength());*/

    //3.1.3
//        ru.sadovskaya.city.City a = new ru.sadovskaya.city.City("A");
//        ru.sadovskaya.city.City b = new ru.sadovskaya.city.City("B", new ru.sadovskaya.city.Destination(a, 5));
//        ru.sadovskaya.city.City c = new ru.sadovskaya.city.City("C", new ru.sadovskaya.city.Destination(a, 6), new ru.sadovskaya.city.Destination(b, 9));
//        System.out.println(a);
//        System.out.println(b);
//        b.addRoadTo(a, 19);
//        System.out.println(b);
//        b.addRoadTo(c, 11);
//        ru.sadovskaya.city.Destination destination = new ru.sadovskaya.city.Destination(c, 11);
//        b.roadTo.add(destination);
//        System.out.println(b);
//        ru.sadovskaya.city.City c = new ru.sadovskaya.city.CityWithRoundTrip("C", new ru.sadovskaya.city.Destination(b, 6));
//        System.out.println(c);
//        c.addRoadTo(a, 5);
//        System.out.println(c);

    //3.2.2
        /*ru.sadovskaya.math.Fraction fraction = new ru.sadovskaya.math.Fraction(11,10);
        System.out.println(fraction.intValue());
        System.out.println(fraction.doubleValue());
        System.out.println(fraction.floatValue());
        System.out.println(fraction.longValue());*/

    //3.2.4
        /*ru.sadovskaya.geometry.Triangle triangle = new ru.sadovskaya.geometry.Triangle(new ru.sadovskaya.geometry.Point2D(1, 2), new ru.sadovskaya.geometry.Point2D(5,6), new ru.sadovskaya.geometry.Point2D(-1,5));
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle);
        ru.sadovskaya.geometry.Circle circle = new ru.sadovskaya.geometry.Circle(new ru.sadovskaya.geometry.Point2D(1,3), 7);
        System.out.println(circle);
        System.out.println(circle.getArea());
        ru.sadovskaya.geometry.Rectangle rectangle = new ru.sadovskaya.geometry.Rectangle(new ru.sadovskaya.geometry.Point2D(1,6), 4,6);
        System.out.println(rectangle);
        rectangle.setLeftUp(new ru.sadovskaya.geometry.Point2D(3, 7));
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        ru.sadovskaya.geometry.Square square = new ru.sadovskaya.geometry.Square(new ru.sadovskaya.geometry.Point2D(1,4), 3);
        System.out.println(square);
        square.setRightUp(new ru.sadovskaya.geometry.Point2D(5,5));
        System.out.println(square);
        System.out.println(square.getArea());*/

    //3.2.5
        /*ru.sadovskaya.geometry.PointUniversal pointUniversal = new ru.sadovskaya.geometry.PointUniversal();
        System.out.println(pointUniversal);
        pointUniversal.addAttribute(new ru.sadovskaya.geometry.ColorAttribute("Красный"));
        System.out.println(pointUniversal);
        pointUniversal.addAttribute(new ru.sadovskaya.geometry.CoordinateAttribute(3));
        System.out.println(pointUniversal);
        pointUniversal.addAttribute(new ru.sadovskaya.geometry.CoordinateAttribute(4, 2, 5));
        System.out.println(pointUniversal);
        pointUniversal.addAttribute(new ru.sadovskaya.geometry.TimeAttribute("11:00"));
        System.out.println(pointUniversal);*/

    //3.3.1
        /*ru.sadovskaya.math.Summator summator1 = new ru.sadovskaya.math.Summator(2, new ru.sadovskaya.math.Fraction(2,5), 2.3);
        System.out.println(summator1.getSum());
        ru.sadovskaya.math.Summator summator2 = new ru.sadovskaya.math.Summator(3.6, new ru.sadovskaya.math.Fraction(49,12), 3, new ru.sadovskaya.math.Fraction(3,2));
        System.out.println(summator2.getSum());
        ru.sadovskaya.math.Summator summator3 = new ru.sadovskaya.math.Summator( new ru.sadovskaya.math.Fraction(1,3), 1);
        System.out.println(summator3.getSum());*/

    //3.3.2
//        ru.sadovskaya.animals.Bird sparrow = new ru.sadovskaya.animals.Sparrow();
//        sparrow.sing();
//        System.out.println(sparrow.getSpecies());
//        ru.sadovskaya.animals.Bird cuckoo = new ru.sadovskaya.animals.Cuckoo();
//        cuckoo.sing();
//        System.out.println(sparrow);
//        ru.sadovskaya.animals.Bird parrot = new ru.sadovskaya.animals.Parrot("Кеша хороший попугай");
//        parrot.sing();
//        System.out.println("----------------------------");
//        ru.sadovskaya.animals.BirdMarket birdMarket = new ru.sadovskaya.animals.BirdMarket();
//        birdMarket.birdsSing(cuckoo, sparrow, parrot);


    //3.3.3
        /*ru.sadovskaya.geometry.Triangle triangle = new ru.sadovskaya.geometry.Triangle(new ru.sadovskaya.geometry.Point2D(1, 2), new ru.sadovskaya.geometry.Point2D(5, 6), new ru.sadovskaya.geometry.Point2D(-1, 5));
        ru.sadovskaya.geometry.Circle circle = new ru.sadovskaya.geometry.Circle(new ru.sadovskaya.geometry.Point2D(1, 3), 7);
        ru.sadovskaya.geometry.Rectangle rectangle = new ru.sadovskaya.geometry.Rectangle(new ru.sadovskaya.geometry.Point2D(1, 6), 4, 6);
        ru.sadovskaya.geometry.Square square = new ru.sadovskaya.geometry.Square(new ru.sadovskaya.geometry.Point2D(1, 4), 3);
        ru.sadovskaya.geometry.FigureListArea figureList = new ru.sadovskaya.geometry.FigureListArea();
        System.out.println(figureList.totalArea(square, rectangle, circle, triangle));*/

    //3.3.4
        /*ru.sadovskaya.animals.Cat cat1 = new ru.sadovskaya.animals.Cat("Васька");
        ru.sadovskaya.animals.Cat cat2 = new ru.sadovskaya.animals.Cat("Рыжик");
        ru.sadovskaya.animals.Cat cat3 = new ru.sadovskaya.animals.Cat("Леопольд");
        ru.sadovskaya.peoples.Person ladyCat = new ru.sadovskaya.peoples.Person("Женщина-кошка", 175);
        ru.sadovskaya.animals.SayMeowList meowList = new ru.sadovskaya.animals.SayMeowList();
        meowList.sayMeow(cat1, cat3, cat2, ladyCat);*/

    //3.3.5
        /*ru.sadovskaya.geometry.Line line1 = new ru.sadovskaya.geometry.Line(new ru.sadovskaya.geometry.Point2D(1,1), new ru.sadovskaya.geometry.Point2D(5,1));
        ru.sadovskaya.geometry.Line line2 = new ru.sadovskaya.geometry.Line(new ru.sadovskaya.geometry.Point2D(1,1), new ru.sadovskaya.geometry.Point2D(7,1));
        ru.sadovskaya.geometry.PolygonalChain polygonalChain = new ru.sadovskaya.geometry.PolygonalChain(new ru.sadovskaya.geometry.Point2D(1,1), new ru.sadovskaya.geometry.Point2D(5,1),
                new ru.sadovskaya.geometry.Point2D(1,1), new ru.sadovskaya.geometry.Point2D(7,1));
        System.out.println(line1.getLength());
        System.out.println(line2.getLength());
        System.out.println(polygonalChain.getLength());
        System.out.println("---------------------------------------");
        ru.sadovskaya.geometry.LengthSummator lengthSummator = new ru.sadovskaya.geometry.LengthSummator();
        System.out.println(lengthSummator.totalLength(line1, line2, polygonalChain));*/

    //3.3.6
        /*ru.sadovskaya.geometry.Square square = new ru.sadovskaya.geometry.Square(new ru.sadovskaya.geometry.Point2D(1,4), 3);
        System.out.println(square);
        System.out.println(square.getBrokenLine());*/

    //3.3.7
        /*ru.sadovskaya.geometry.Square square = new ru.sadovskaya.geometry.Square(new ru.sadovskaya.geometry.Point2D(1,4), 3);
        ru.sadovskaya.geometry.Triangle triangle = new ru.sadovskaya.geometry.Triangle(new ru.sadovskaya.geometry.Point2D(1, 2),
                new ru.sadovskaya.geometry.Point2D(5, 6), new ru.sadovskaya.geometry.Point2D(-1, 5));
        System.out.println(square.getPolygonalChain());
        System.out.println(triangle.getPolygonalChain());
        System.out.println("-------------------------");
        ru.sadovskaya.geometry.GetPolygonal getPolygonal = new ru.sadovskaya.geometry.GetPolygonal();
        System.out.println(getPolygonal.makePolygonalChain(square, triangle));*/

    //3.3.9
//        ru.sadovskaya.city.City a = new ru.sadovskaya.city.City("A");
//        ru.sadovskaya.city.City b = new ru.sadovskaya.city.City("B", new ru.sadovskaya.city.Destination(a, 5));
//        ru.sadovskaya.city.City c = new ru.sadovskaya.city.City("C", new ru.sadovskaya.city.Destination(b, 3));
//        ru.sadovskaya.city.City d = new ru.sadovskaya.city.City("D", new ru.sadovskaya.city.Destination(a, 6), new ru.sadovskaya.city.Destination(c, 4));
//        ru.sadovskaya.city.City e = new ru.sadovskaya.city.City("E");
//        ru.sadovskaya.city.City f = new ru.sadovskaya.city.City("F", new ru.sadovskaya.city.Destination(b, 1), new ru.sadovskaya.city.Destination(e, 2));


}
