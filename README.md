# Работа с коммандной строкой
# JUnit4 runners, maven command line, параметры, считывание тестовых данных из файла

# очистка, перекомпиляция и запуск тестов всех классов начинающихся на AppTest
# mvn clean test -Dtest="AppTest*"

# очистка, перекомпиляция и запуск тестов всех классов AppTest,AppTest2
# mvn clean test -Dtest=AppTest,AppTest2

# запуск тестовых кейсов meth01Test, meth06Test в классах AppTest,AppTest2
# mvn test -Dtest=AppTest#meth01Test,AppTest2#meth06Test

# запуск тестов, аннотированных @Category({IRegressTest.class}) в классах AppTest,AppTest2
# mvn test -Dtest=AppTest* -Dgroups=IRegressTest

