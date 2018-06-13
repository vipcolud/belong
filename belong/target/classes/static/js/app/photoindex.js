const items = document.querySelectorAll('img');

const itemCount = items.length;
const nextItem = document.querySelector('.next');
const previousItem = document.querySelector('.previous');
let count = 0;

function showNextItem() {
  items[count].classList.remove('active');

  if(count < itemCount - 1) {
    count++;
  } else {
    count = 0;
  }

  items[count].classList.add('active');
  console.log(count);
}

function showPreviousItem() {
  items[count].classList.remove('active');

  if(count > 0) {
    count--;
  } else {
    count = itemCount - 1;
  }

  items[count].classList.add('active');
  console.log(count);
}
const titems = document.querySelectorAll('h3');
const titemCount = titems.length;

let tcount = 0;

function tshowNextItem() {
  titems[tcount].classList.remove('active');

  if(tcount < titemCount - 1) {
    tcount++;
  } else {
    tcount = 0;
  }

  titems[tcount].classList.add('active');
  console.log(count);
}

function tshowPreviousItem() {
  titems[tcount].classList.remove('active');

  if(tcount > 0) {
    tcount--;
  } else {
    tcount = titemCount - 1;
  }

  titems[tcount].classList.add('active');
  console.log(count);
}



nextItem.addEventListener('click', showNextItem);

previousItem.addEventListener('click', showPreviousItem);

nextItem.addEventListener('click', tshowNextItem);

previousItem.addEventListener('click', tshowPreviousItem);