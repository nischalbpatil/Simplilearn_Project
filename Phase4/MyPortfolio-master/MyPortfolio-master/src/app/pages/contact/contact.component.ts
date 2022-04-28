import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css'],
})
export class ContactComponent implements OnInit {

  firstname?: string;
  lastname?: string;
  email?: string;
  message?: string;

  constructor() { }

  ngOnInit() {

    //create api call

    //create the form based on api fields
  }

  submitForm() {

    const message = `My first name is ${this.firstname} and my last name is ${this.lastname}. My email is ${this.email} and the message is ${this.message}`;

    //grab all the fields and their values

    alert(message);
  }

}
