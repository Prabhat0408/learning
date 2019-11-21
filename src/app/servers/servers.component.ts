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
  allowNewServer = false;
  serverCreated = 'Serever not created';
  serverName = 'Server Name';
  serverStatus = false;
  servers = ['server 1', 'server 2'];


  constructor() {
    setTimeout(() => {
      this.allowNewServer = true;
    }, 2000 );
   }

  ngOnInit() {
  }

  onServerClick() {
    this.serverStatus = true;
    this.servers.push(this.serverName);
    this.serverCreated = `Server Created with ${this.serverName}`;
  }

  onUpdateServer(event: Event) {
    this.serverName = (event.target as HTMLInputElement).value;
  }


}
