package com.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import androidx.collection.ArrayMap;

//*********************************************************************
public class ListUtils
        //*********************************************************************

{

    /**
     * return list that satisfy a specific condition
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @return
     */
    //*********************************************************************
    public static <T> List<T> findWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        List<T> tempList = new ArrayList<>();
        for (T item : list)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                tempList.add(item);
            }
        }
        return tempList;
    }


    /**
     * return first element from the list that satisfy condition from top to bottom
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @return
     */
    //*********************************************************************
    public static <T> T firstWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        for (T item : list)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                return item;
            }
        }
        return null;
    }


    /**
     * return first element from the list that satisfy condition from bottom to top
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @return
     */
    //*********************************************************************
    public static <T> T lastWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        List<T> tempList = new ArrayList<>();
        for (T item : list)
        {
            tempList.add(0, item);
        }
        for (T item : tempList)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                return item;
            }
        }
        return null;
    }

/*
    //*********************************************************************
    public static <T> T updateWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        for (T item : list)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                return item;
            }
        }
        return null;
    }*/

    /**
     * return first index where condition satisfy
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @return
     */
    //*********************************************************************
    public static <T> int indexWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        int index = 0;
        for (T item : list)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * Convert List of item to other list with different Type
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @return
     */

    //*********************************************************************
    public static <T> List<Object> mapToObject(List<T> list, MapInterface<T> listInterface)
    //*********************************************************************
    {
        List<Object> objectList = new ArrayList<Object>();
        for (T item : list)
        {
            if (listInterface != null)
            {
                objectList.add(listInterface.filter(item));
            }
        }
        return objectList;
    }

    /**
     * Convert List of item to other list with different Type with provided type
     *
     * @param list
     * @param listInterface
     * @param <T>
     * @param <U>
     * @return
     */

    //*********************************************************************
    public static <T, U> List<U> mapToType(List<T> list, MapInterface<T> listInterface)
    //*********************************************************************
    {
        List<U> objectList = new ArrayList<U>();
        for (T item : list)
        {
            if (listInterface != null)
            {
                objectList.add((U)listInterface.filter(item));
            }
        }
        return objectList;
    }


    /**
     * return the sum of specific field of giver list
     *
     * @param list
     * @param sumInterface
     * @param <T>
     * @return
     */

    //*********************************************************************
    public static <T> double sum(List<T> list, SumInterface<T> sumInterface)
    //*********************************************************************
    {
        double sum = 0;
        for (T item : list)
        {
            if (sumInterface != null)
            {
                sum += sumInterface.sum(item);
            }
        }
        return sum;
    }

    /**
     * return the sum of specific field of giver list satisfy given condition
     *
     * @param list
     * @param filterInterface
     * @param sumInterface
     * @param <T>
     * @return
     */
    //*********************************************************************
    public static <T> double sumWhere(List<T> list, ListInterface<T> filterInterface, SumInterface<T> sumInterface)
    //*********************************************************************
    {
        double sum = 0;
        for (T item : list)
        {
            if (sumInterface != null && filterInterface != null)
            {
                if (filterInterface.filter(item))
                    sum += sumInterface.sum(item);
            }
        }
        return sum;
    }


    //*********************************************************************
    public static <T> List<T> removeWhere(List<T> list, ListInterface<T> listInterface)
    //*********************************************************************
    {
        List<T> tempList = new ArrayList<>();
        for (T item : list)
        {
            if (listInterface != null && !listInterface.filter(item))
            {
                tempList.add(item);
            }
        }
        return tempList;
    }

    //*********************************************************************
    public static <T> void forEach(List<T> list, ForEachInterface<T> listInterface)
    //*********************************************************************
    {
        int index = 0;
        for (T item : list)
        {
            if (listInterface != null)
            {
                listInterface.loop(item, index);
                index++;
            }
        }
    }


    //*********************************************************************
    public static <T> void updateWhere(List<T> list, T updatedObject, ListInterface<T> listInterface)
    //*********************************************************************
    {
        int index = 0;
        for (T item : list)
        {
            if (listInterface != null && listInterface.filter(item))
            {
                list.set(index, updatedObject);
            }
            index++;
        }
    }

}


