package RamerPeucket;

import java.util.*;

/**
 * Created by Joywalker on 4/28/2017.
 */
public class RamerDouglasPeucker {

    private static List<Point> filteredList;
    private static int startIndex = 0;
    private static int lastIndex;
    public static List<Point> RamerDouglasPeuckerFilter(List<Point> points,double epsilon) {

        double furthestPointDistance = 0.0;
        int furthestPointIndex = 0;
        LineEquation line = new LineEquation(points.get(startIndex), points.get(points.size() - 1)); //set the line
            for (int i = 1; i < points.size() - 1; i++) {
                // calculate distance from points to line and get the furthest point and it's index
                double currentDistance = line.perpendicularDistance(points.get(i));
                if (currentDistance > furthestPointDistance ) {
                    furthestPointDistance = currentDistance;
                    furthestPointIndex = i;
                }
            }
            // select furthest point as the middle point for the next execution
            if (furthestPointDistance > epsilon) {
                //split points list in 2, and recursively call the algorithm
                List<Point> firstHalf = RamerDouglasPeuckerFilter(points.subList(startIndex, furthestPointIndex+1), epsilon);
                List<Point> secondHalf = RamerDouglasPeuckerFilter(points.subList(furthestPointIndex, points.size()), epsilon);
                /**
                 * Initialize the final list with filtered points.
                 * As it goes recursively, the in this list will be stored all the points from
                 * the middle point to last point.
                 */
                List<Point> finalList = new ArrayList<Point>(firstHalf);
                finalList.addAll(secondHalf.subList(1, secondHalf.size()));
                filteredList = finalList;
                return filteredList;
            } else {
                return line.asList();
            }
        }

    public static void printValues() //print points to console
    {
        for (Point point : filteredList)
        {
            System.out.println(point.toString());
        }
    }
    }

