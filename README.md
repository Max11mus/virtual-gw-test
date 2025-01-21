# [Task №1:](./Task1.java)

Use a recursion to display all the numbers from the 1st to the entered.

Example:
r.count(5);

Result:
1
2
3
4
5

# [Task №2:](./Task2.java)
Change the address abbreviation to a full word in 2 ways, one of them RegExp.

Ave -> Avenue
Ave. -> Avenue
St -> Street
St. -> Street
Str -> Street
Str. -> Street

Input data:
555 Straight Stave Ave, San Francisco, CA 94104
444 Ave Maria Stairway St., San Francisco, CA 94104
9032 Flave Steep Str, San Francisco, CA 94104

Result:
555 Straight Stave Avenue, San Francisco, CA 94104
444 Ave Maria Stairway Street, San Francisco, CA 94104
9032 Flave Steep Street, San Francisco, CA 94104

# [Task №3:](./Task3.java)
At the beginning of each hour for three minutes the green light is on,
then for one minute - yellow,
and then for one minute - red,
then again the green light is on for three minutes, and so on.
Enter from the keyboard a number t, which means the time in minutes elapsed since the beginning of the next hour.
Determine what color signal is lit for pedestrians at that moment.
The result is displayed in the following form:
"green" - if the color is green,
"yellow" - if the color is yellow,
"red" - if the color is red.

Example for number 2.5:
green
Example for number 3:
yellow
Example for number 4:
red
Example for number 5:
green


# [Task №4:](./Task4.java)

Use java.time.Month.values() and stream API with next requirenments to return list of integers:
1. integers represent name lengths of months;
2. only use months whose name contains 'substring' parameter;
3. do not need to have duplicates in result list.

For example, function call with "J" param will return [7, 4], because JANUARY has 7 letter, JUNE and JULY have 4 letters.


public static List<Integer> test(String substring) {
// implementation here
}