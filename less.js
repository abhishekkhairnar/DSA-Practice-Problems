const less = require('less');

const lessCode = `
  @baseFontSize: 16px;

  .font-size-increase(@size) {
    font-size: @size + 2px;
  }

  h1 {
    .font-size-increase(@baseFontSize);
  }
`;

less.render(lessCode, (err, output) => {
  if (err) {
    console.error('Error:', err);
  } else {
    console.log('Compiled CSS:\n', output.css);
  }
});
