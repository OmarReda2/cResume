import { User } from 'src/app/common/user';
import { UserDataService } from './../../services/user-data.service';
import { Component, OnInit } from '@angular/core';
import { Link } from 'src/app/common/link';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  id:number=1;
  user?:User;
  links?:Link[];

  constructor(private userDataService: UserDataService) { }
  ngOnInit(): void {
    this.getUserData();
    this.getLinks();
  }


  getUserData() {
    this.userDataService.getUserData(this.id).subscribe(
      data => {
        this.user = data;
      }
    )
  }

  
  getLinks() {
    this.userDataService.getLinksData(this.id).subscribe(
      data=> {
        this.links = data;
      }
    )
  }


}
