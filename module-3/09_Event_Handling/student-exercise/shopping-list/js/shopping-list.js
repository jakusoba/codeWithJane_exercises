let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const list = document.querySelector('.shopping-list ul');

  for (let i = 0; i < groceries.length; i++) {
    const listItem = document.createElement('li');
    listItem.innerText = groceries[i].name;
    list.insertAdjacentElement('beforeend', listItem);
  }

}
//setPageTitle();
//displayGroceries();
document.addEventListener('DOMContentLoaded', (event) =>{
    setPageTitle();
    displayGroceries();
    const items = document.querySelectorAll('li');

      items.forEach((item) => {
          item.addEventListener('click', () => {
              if (!item.classList.contains('completed')) {
                  item.classList.add('completed');
                  item.querySelector('i').classList.add('completed');
              }
          });
        
        item.addEventListener('dblclick', () => {
          if(item.classList.contains('completed')) {
            item.classList.remove('completed');
            item.querySelector('i').classList.remove('completed')
          }
        });
      });
      
    const completeAll = document.getElementById('toggleAll');
    completeAll.addEventListener('click', (event) => {
      for (let i = 0; i < items.length; i++) {
        items[i].completed = true;
        items[i].classList.add('completed');
        items[i].querySelector('i').classList.add('completed');
      
        allItemsIncomplete = false;
        
    }
    completeAll.innerText = "Mark All Incomplete";
    });
  });
