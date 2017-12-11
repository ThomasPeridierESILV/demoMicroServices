import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CatalogueClientComponent } from './catalogue-client.component';

describe('CatalogueClientComponent', () => {
  let component: CatalogueClientComponent;
  let fixture: ComponentFixture<CatalogueClientComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CatalogueClientComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CatalogueClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
