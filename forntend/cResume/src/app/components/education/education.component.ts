import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Education } from 'src/app/common/education';
import { UserDataService } from 'src/app/services/user-data.service';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit{

  id:number=1;
  educations?:Education[];

  constructor(private userDataService:UserDataService){ }

  ngOnInit(): void {
   this.getEducations();    
  }


  getEducations() {
    this.userDataService.getEducationsData(this.id).subscribe(
      data => { 
        this.educations = data;
      }
    )
  }

}
