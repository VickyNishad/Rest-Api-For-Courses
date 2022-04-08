package com.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.model.CourseContent;
import com.course.model.ListOfCourse;


/**
 * 
 * @author 33000014
 *
 */

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<ListOfCourse> list;
	List<CourseContent> list1;

	public CourseServiceImpl() {
		list = new ArrayList<ListOfCourse>();
		list1 = new ArrayList<CourseContent>();
		
		list1.add(new CourseContent("https://www.youtube.com/watch?v=hEgO047GxaQ","https://www.youtube.com/watch?v=hEgO047GxaQ",
				"https://www.youtube.com/watch?v=hEgO047GxaQ","https://www.youtube.com/watch?v=hEgO047GxaQ",
				"https://www.youtube.com/watch?v=hEgO047GxaQ","https://www.youtube.com/watch?v=hEgO047GxaQ"));
		
		
		
		list.add(new ListOfCourse("", 1, "Python", "Python", "Python", "ayush", 1900.00, 4, "6 month", "https://www.youtube.com/watch?v=hEgO047GxaQ",
				list1,"100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min", "5th feb ,2022",
				"", 5));
		list.add(new ListOfCourse("", 2, "java", "java", "java", "java", 1900.00, 4, "6 month", "https://www.youtube.com/watch?v=lL2PXC1fmnQ",
				list1,"100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min", "5th feb ,2022",
				"", 5));
		list.add(new ListOfCourse("", 3, "web development", "web development", "web development", "ayush", 1900.00, 4, "6 month", "https://www.youtube.com/watch?v=l1EssrLxt7E",
				list1,"100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min", "5th feb ,2022",
				"", 5));
		list.add(new ListOfCourse("", 4, "mutual funds", "mutual funds", "mutual funds", "ayush", 1900.00, 4, "6 month", "https://www.youtube.com/watch?v=M988_fsOSWo",
				list1,"100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min", "5th feb ,2022",
				"", 5));
		list.add(new ListOfCourse("", 5, "Cloud computing", "Cloud computing", "Cloud computing", "ayush", 1900.00, 4, "6 month", "https://www.youtube.com/watch?v=M988_fsOSWo",
				list1,"100% online", 5, "15 section", "143 lecturs", "", "", "5", "beginner", "14h 10min", "5th feb ,2022",
				"", 5));
	}

	@Override
	public List<ListOfCourse> getAllCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public ListOfCourse getCourse(int id) {
		ListOfCourse course = null;
		for (ListOfCourse listOfCourse : list) {
			if(listOfCourse.getId() == id)
			{
				course= listOfCourse;
				
			}
			
		}
		return course;
	}

//	@Override
//	public ListOfCourse getSingleCourse( List<ListOfCourse> list ,Integer id) {
//		for (ListOfCourse  list1 :list) {
//			if (id.equals(list1.getId())) {
//				return list1;
//			}
//		}
//		return null;
//	}


	
}
