package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableMonies_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfNullableMonies: Set[Option[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableMonies_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableMonies_3("+ URI +")"

   def copy(oneSetOfNullableMonies: Set[Option[BigDecimal]] = this._oneSetOfNullableMonies): OneSetOfNullableMonies_3 = {

  require(oneSetOfNullableMonies ne null, "Null value was provided for property \"oneSetOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMonies)
    new OneSetOfNullableMonies_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfNullableMonies = oneSetOfNullableMonies)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableMonies_3): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableMonies = result._oneSetOfNullableMonies
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfNullableMonies_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfNullableMonies")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableMonies = {
    _oneSetOfNullableMonies
  }

  def oneSetOfNullableMonies_= (value: Set[Option[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableMonies = value

    _oneSetOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_oneSetOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableMonies") oneSetOfNullableMonies: Set[Option[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfNullableMonies = if (oneSetOfNullableMonies == null) Set.empty else oneSetOfNullableMonies)

}

object OneSetOfNullableMonies_3 extends AggregateRootCompanion[OneSetOfNullableMonies_3]{

  def apply(
    oneSetOfNullableMonies: Set[Option[BigDecimal]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableMonies)
    require(oneSetOfNullableMonies ne null, "Null value was provided for property \"oneSetOfNullableMonies\"")
    new OneSetOfNullableMonies_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfNullableMonies = oneSetOfNullableMonies)
  }

}
