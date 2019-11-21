import { Component } from '@angular/core';
import { preserveWhitespacesDefault } from '@angular/compiler';


@Component( {
    selector: 'app-server',
    templateUrl: './Server.component.html',
    styles: [`
    .online {
        color: white;
    }
    `]
})
export class ServerComponent {
    serverId = 10;
    serverStatus = 'Offline';
    constructor() {
     }
    getServerStatus() {
        return this.serverStatus = Math.random() > 0.5 ? 'Online' : 'Offline';
    }
    getStatusColor() {
        return this.serverStatus === 'Online' ? 'green' : 'red';
    }
}
