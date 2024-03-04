import { Component } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  specie: string = '';
  species: string[] = ['cachorro', 'Gato'];
  raceDog: string[] = ['Caramelo', 'Auau'];
  race: string = ''

  
  colors: string[] = ['white', 'flamingo', 'pínk'];

}
