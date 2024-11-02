import { Component } from '@angular/core';
import { SpellbookComponent } from './spellbook/spellbook.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  imports: [SpellbookComponent, HttpClientModule] 
})
export class AppComponent {
  title = 'spellbook-app';
}
