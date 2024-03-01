import { Component } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  species: string[] = [];

  races: string[] = [];

  colors: string[] = ['white', 'flamingo', 'pínk'];

  
  constructor() { }
}
