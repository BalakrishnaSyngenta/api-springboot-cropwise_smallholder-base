# Cropwise Smallholder Backend

## Getting Started
1. clone this repo;
2. import in STS;
3. turn on SonarLint;
3. run.

The app will be listening on `port: 8080`

## Contributing

### Version Control

- Git-flow, _checking out from_ / _merging to_ branch `develop`;
- At least 2 reviewers required;
- Be gentle in the comments when code reviewing;
- Test the changes before merging.

### CI/CD
- SonarCloud is disabled for now, but new code with _smells_ or _warnings_ must be reject;

### Package Structure

Try to follow the suggested package structure and classes' naming convention:

com.syngenta.cropwise.smallholder.stub <br>
  └─ api <br>
    └─ helloworld <br>
      └─ controller <br>
        └─ HelloWord**Controller**.java <br>
      └─ data <br>
        └─ request <br>
          └─ GetAll**QueryParams**.java <br>
    ├─ **[your API's base resource]** <br>
      └─ controller <br>
        └─ **[resource name]-Controller**.java <br>
      └─ data <br>
        └─ request <br>
          └─ **[method name]-QueryParams**.java <br>
          └─ **[method name]-Body** (when you need to validate the payload structure) <br>

Feel free to propose conventions for unforeseen cases or to update existing ones.
