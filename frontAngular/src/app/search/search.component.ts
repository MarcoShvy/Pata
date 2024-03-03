import { Component } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  species: string[] = ['Cachorro', 'Gato'];

  racesDog: string[] = [];

  racesCat: string[] = [];

  colors: string[] = ['white', 'flamingo', 'pínk'];

  specie: string = ''

  
  constructor() {
    console.log(this.specie)
   }
}
