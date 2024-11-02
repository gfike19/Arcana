import { TestBed } from '@angular/core/testing';

import { SpellbookService } from './spellbook.service';

describe('SpellbookService', () => {
  let service: SpellbookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SpellbookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
