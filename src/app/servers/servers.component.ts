import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
 /*another ways of using selector
   selector: '[app-servers]',
  another ways of using selector
   selector: '.app-servers', */
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.scss']
})
export class ServersComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
