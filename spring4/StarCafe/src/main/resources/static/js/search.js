	window.addEventListener("load", () => {
		document.querySelector("select[name='search']").addEventListener("change", e => {			
			//console.dir(e.target);		
			//const item = e.target[e.target.selectedIndex];			
			//alert(item.textContent);
			
			document.querySelectorAll(".keyword-all").forEach(item => {
				item.disabled = true;
			});
			
			const value = e.target.value;
			
			document.querySelectorAll(`.keyword-${e.target.value}`).forEach(item => {
				item.disabled = false;
			});
		});
	});