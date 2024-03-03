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
  raceCat: string[] = ['Siames', 'Persa']
  race: string = ''

  

  raceSelect() {
    if (this.specie == 'cachorro') {
      return this.raceDog
    } else {
    return this.raceCat
  }
  }


  colors: string[] = ['white', 'flamingo', 'pínk'];

}
