import { Component, OnInit } from '@angular/core';
import { SpellbookService } from '../spellbook/../spellbook.service';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-spellbook',
  templateUrl: './spellbook.component.html',
  standalone: true,
  imports: [HttpClientModule]
})
// export class SpellbookComponent {
 
//   spellbookContent = SpellbookService.
  export class SpellbookComponent implements OnInit {
  spellbookContent: string = '';

  constructor(private spellbookService: SpellbookService) { }

  ngOnInit(): void {
    this.spellbookService.getSpellbook().subscribe({
      next: (data) => {
        this.spellbookContent = data;
      },
      error: (error) => {
        console.error('Error fetching spellbook', error);
      },
      complete: () => {
        console.log('Spellbook data fetching complete');
      }
    });
    
  }
}
