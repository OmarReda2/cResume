import { UserDataService } from './../../services/user-data.service';
import { Component, OnInit } from '@angular/core';
import { Course } from 'src/app/common/course';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent implements OnInit{

  id:number = 1;
  courses?:Course[];
  updatedCoursesArr:Map<number|undefined,Course> = new Map<number|undefined,Course>();

  constructor(private userDataService: UserDataService) { }
  ngOnInit(): void {
    
    this.getCourses()
  }


  getCourses() {
    this.userDataService.getCoursesData(this.id).subscribe(
      data => {
        this.courses = data;
      }
    )
  }
   addUpdatedCourses(course:Course){
      this.updatedCoursesArr.set(course.id, course)
      // console.log(link);
    }
    updateCourseData(){
      this.updatedCoursesArr?.forEach(course => {
        this.userDataService.updateCourseData(this.id,course.id,course).subscribe(
          data => {
            alert("Course Updated Successfully")
            
            
          },
          err=>{
            alert("Course Update Failed")
            console.log(err);
            
          }
        )
      });
    }

}
