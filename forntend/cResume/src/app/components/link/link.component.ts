import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Link } from 'src/app/common/link';
import { UserDataService } from 'src/app/services/user-data.service';

@Component({
  selector: 'app-link',
  templateUrl: './link.component.html',
  styleUrls: ['./link.component.css']
})
export class LinkComponent implements OnInit{

  id:number=1;
  links?:Link[];

  constructor(private userDataService:UserDataService) {}  
  ngOnInit(): void {
      this.getLinks();
  }


  getLinks() {
    this.userDataService.getLinksData(this.id).subscribe(
      data=> {
        this.links = data;
      }
    )
  }
}
