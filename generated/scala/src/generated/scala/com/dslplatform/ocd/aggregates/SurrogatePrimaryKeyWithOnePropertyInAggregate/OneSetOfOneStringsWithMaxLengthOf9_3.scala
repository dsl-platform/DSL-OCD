package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneStringsWithMaxLengthOf9_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneStringsWithMaxLengthOf9_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneStringsWithMaxLengthOf9_3("+ URI +")"

   def copy(oneSetOfOneStringsWithMaxLengthOf9: Set[String] = this._oneSetOfOneStringsWithMaxLengthOf9): OneSetOfOneStringsWithMaxLengthOf9_3 = {

  require(oneSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionLength(oneSetOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStringsWithMaxLengthOf9)
    new OneSetOfOneStringsWithMaxLengthOf9_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneStringsWithMaxLengthOf9 = oneSetOfOneStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneStringsWithMaxLengthOf9_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneStringsWithMaxLengthOf9 = result._oneSetOfOneStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneStringsWithMaxLengthOf9_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneStringsWithMaxLengthOf9")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneStringsWithMaxLengthOf9 = {
    _oneSetOfOneStringsWithMaxLengthOf9
  }

  def oneSetOfOneStringsWithMaxLengthOf9_= (value: Set[String]) {
    com.dslplatform.api.Guards.checkCollectionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneStringsWithMaxLengthOf9") oneSetOfOneStringsWithMaxLengthOf9: Set[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneStringsWithMaxLengthOf9 = if (oneSetOfOneStringsWithMaxLengthOf9 == null) Set.empty else oneSetOfOneStringsWithMaxLengthOf9)

}

object OneSetOfOneStringsWithMaxLengthOf9_3 extends AggregateRootCompanion[OneSetOfOneStringsWithMaxLengthOf9_3]{

  def apply(
    oneSetOfOneStringsWithMaxLengthOf9: Set[String] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionLength(oneSetOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneStringsWithMaxLengthOf9)
    require(oneSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"oneSetOfOneStringsWithMaxLengthOf9\"")
    new OneSetOfOneStringsWithMaxLengthOf9_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneStringsWithMaxLengthOf9 = oneSetOfOneStringsWithMaxLengthOf9)
  }

}
