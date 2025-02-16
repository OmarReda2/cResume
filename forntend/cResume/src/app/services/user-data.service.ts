import { Link } from './../common/link';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { User } from '../common/user';
import { Course } from '../common/course';
import { Education } from '../common/education';

@Injectable({
  providedIn: 'root'
})
export class UserDataService {

  private baseUrl = "http://localhost:8080";
  


  constructor(private httpclient:HttpClient) { }


  getUserData(id:number):Observable<User>{
    const userUrl = `${this.baseUrl}/users/${id}`
    return this.httpclient.get<User>(userUrl);
  }

  updateUserData(id:number):Observable<User>{
    
  }


  getCoursesData(userId:number):Observable<Course[]>{
    const searchUrl = `${this.baseUrl}/courses/search/findByUserId?userId=${userId}`;
    return this.httpclient.get<getCoursesRes>(searchUrl).pipe(
      map(res => res._embedded.courses)
    )
  }


  getEducationsData(userId:number):Observable<Education[]>{
    const searchUrl = `${this.baseUrl}/educations/search/findByUserId?userId=${userId}`
    return this.httpclient.get<getEducatoinsRes>(searchUrl).pipe(
      map(res => res._embedded.educations)
    )
  }


  getLinksData(userId:number):Observable<Link[]>{
    const searchUrl = `${this.baseUrl}/links/search/findByUserId?userId=${userId}`
    return this.httpclient.get<getLinksRes>(searchUrl).pipe(
      map(res => res._embedded.links)
    )
  }
}








interface getCoursesRes {
  _embedded: {
    courses: Course[]
  }
}

interface getEducatoinsRes {
  _embedded: {
    educations: Education[];
  }
}

interface getLinksRes {
  _embedded: {
    links: Link[];
  }
}


